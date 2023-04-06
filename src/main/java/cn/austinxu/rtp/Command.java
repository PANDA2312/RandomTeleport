package cn.austinxu.rtp;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import java.util.Random;
public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, org.bukkit.command.@NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player p =  (Player) commandSender;
        Random r = new Random();
        Random r2 = new Random(r.nextInt(2147483647));
        int randNum1 = r.nextInt(2147483647);
        int randNum2 = r2.nextInt(2147483647);
        Block block = block = p.getWorld().getBlockAt(randNum1, 64, randNum2);
        for (int i = 319; i > -64; i--) {
            p.getWorld().loadChunk(block.getChunk());
            if (p.getWorld().getBlockAt(randNum1, i, randNum2).getType() != Material.AIR)
            {
                block = p.getWorld().getBlockAt(randNum1, i, randNum2);
                break;
            }
        }
        p.teleport(block.getLocation().getBlockY());
        return false;
    }
}