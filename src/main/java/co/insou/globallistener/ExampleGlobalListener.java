package co.insou.globallistener;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleGlobalListener extends GlobalListener {

    private final JavaPlugin plugin;

    public ExampleGlobalListener(JavaPlugin plugin) {
        super(plugin, false);
        this.plugin = plugin;
    }

    @Override
    protected void onEvent(Event event) {
        plugin.getLogger().info(String.format("Event called: \"%s\"", event.getEventName()));
    }

}
