package dev.lucaargolo.charta.client.compat;

import dev.lucaargolo.charta.client.render.screen.GameScreen;
import dev.lucaargolo.charta.common.ChartaMod;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.gui.handlers.IGuiContainerHandler;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import net.minecraft.client.renderer.Rect2i;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

@JeiPlugin
public class JEICompat implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ChartaMod.id("jei_compat");
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addGenericGuiContainerHandler(
                GameScreen.class,
                new IGuiContainerHandler<GameScreen<?, ?>>() {
                    @Override
                    public List<Rect2i> getGuiExtraAreas(GameScreen<?, ?> screen) {
                        return List.of(new Rect2i(0, 0, screen.width, screen.height));
                    }
                }
        );
    }
}
