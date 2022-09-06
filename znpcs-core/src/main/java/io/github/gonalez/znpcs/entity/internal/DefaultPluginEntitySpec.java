package io.github.gonalez.znpcs.entity.internal;

import io.github.gonalez.znpcs.entity.PluginEntityListener;
import io.github.gonalez.znpcs.entity.PluginEntitySpec;
import org.bukkit.Location;

/**
 * @author Gaston Gonzalez {@literal <znetworkw.dev@gmail.com>}
 */
public class DefaultPluginEntitySpec implements PluginEntitySpec {
    private final Location location;
    private final PluginEntityListener listener;

    public DefaultPluginEntitySpec(
        Location location, PluginEntityListener listener) {
        this.location = location;
        this.listener = listener;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public PluginEntityListener getListener() {
        return listener;
    }
}
