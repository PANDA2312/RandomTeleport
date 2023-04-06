package cn.austinxu.rtp;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Rtp extends JavaPlugin{

    @Override
    public void onEnable() {
        getCommand("rtp").setExecutor(new Command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
