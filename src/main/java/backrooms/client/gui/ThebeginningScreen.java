package backrooms.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

import backrooms.world.inventory.ThebeginningMenu;

import backrooms.network.ThebeginningButtonMessage;

import backrooms.MinebbbMod;

public class ThebeginningScreen extends AbstractContainerScreen<ThebeginningMenu> {
	private final static HashMap<String, Object> guistate = ThebeginningMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox SUMMON;
	Button button_close;
	Button button_quit;
	Button button_summon_mob;

	public ThebeginningScreen(ThebeginningMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 255;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("minebbb:textures/screens/thebeginning.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		SUMMON.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (SUMMON.isFocused())
			return SUMMON.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		SUMMON.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.minebbb.thebeginning.label_terminal"), 10, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		SUMMON = new EditBox(this.font, this.leftPos + 10, this.topPos + 52, 120, 20, Component.translatable("gui.minebbb.thebeginning.SUMMON")) {
			{
				setSuggestion(Component.translatable("gui.minebbb.thebeginning.SUMMON").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.minebbb.thebeginning.SUMMON").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.minebbb.thebeginning.SUMMON").getString());
				else
					setSuggestion(null);
			}
		};
		SUMMON.setMaxLength(32767);
		guistate.put("text:SUMMON", SUMMON);
		this.addWidget(this.SUMMON);
		button_close = new Button(this.leftPos + 190, this.topPos + 133, 51, 20, Component.translatable("gui.minebbb.thebeginning.button_close"), e -> {
			if (true) {
				MinebbbMod.PACKET_HANDLER.sendToServer(new ThebeginningButtonMessage(0, x, y, z));
				ThebeginningButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_close", button_close);
		this.addRenderableWidget(button_close);
		button_quit = new Button(this.leftPos + 10, this.topPos + 25, 46, 20, Component.translatable("gui.minebbb.thebeginning.button_quit"), e -> {
			if (true) {
				MinebbbMod.PACKET_HANDLER.sendToServer(new ThebeginningButtonMessage(1, x, y, z));
				ThebeginningButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_quit", button_quit);
		this.addRenderableWidget(button_quit);
		button_summon_mob = new Button(this.leftPos + 136, this.topPos + 52, 77, 20, Component.translatable("gui.minebbb.thebeginning.button_summon_mob"), e -> {
			if (true) {
				MinebbbMod.PACKET_HANDLER.sendToServer(new ThebeginningButtonMessage(2, x, y, z));
				ThebeginningButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_summon_mob", button_summon_mob);
		this.addRenderableWidget(button_summon_mob);
	}
}
