package com.github.crafttogether.log4jfilter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class Log4jFilter extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ((Logger) LogManager.getRootLogger()).addFilter(new MatcherFilter());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
