package eu.pintergabor.dirtcheap;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ModCommon.MODID)
public class ModCommon {
	public static final String MODID = "dirtcheap";
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogUtils.getLogger();

	public ModCommon() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
