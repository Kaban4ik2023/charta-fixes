package dev.lucaargolo.charta.client.render;

import com.mojang.blaze3d.vertex.VertexFormat;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class FabricModRenderTypeManager extends ModRenderTypeManager {

    protected RenderType createComposite(String name, VertexFormat format, VertexFormat.Mode mode, int bufferSize, boolean affectsCrumbling, boolean sortOnUpload, CompositeState state) {
        return create(name, format, mode, bufferSize, affectsCrumbling, sortOnUpload, state);
    }

}
