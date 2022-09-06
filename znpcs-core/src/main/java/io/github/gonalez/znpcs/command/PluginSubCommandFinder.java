package io.github.gonalez.znpcs.command;

import io.github.gonalez.znpcs.command.internal.DefaultPluginSubCommandFinder;

/**
 * Interface for finding a specific subcommand from a list of subcommands.
 *
 * @author Gaston Gonzalez {@literal <znetworkw.dev@gmail.com>}
 */
public interface PluginSubCommandFinder {
    static PluginSubCommandFinder of() {
        return DefaultPluginSubCommandFinder.INSTANCE;
    }

    PluginSubCommand find(String context, Iterable<PluginSubCommand> subCommands);
}
