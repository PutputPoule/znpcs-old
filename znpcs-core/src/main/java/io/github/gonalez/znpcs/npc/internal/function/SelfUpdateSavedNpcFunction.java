package io.github.gonalez.znpcs.npc.internal.function;

import com.google.common.collect.ImmutableList;
import io.github.gonalez.znpcs.npc.Npc;
import io.github.gonalez.znpcs.npc.function.NpcFunctionContext;
import io.github.gonalez.znpcs.npc.function.NpcFunctionValue;

/**
 * A simple {@link SimpleValidateSavedNpcFunction} that just respawns the npc when running the function.
 *
 * @author Gaston Gonzalez {@literal <znetworkw.dev@gmail.com>}
 */
public class SelfUpdateSavedNpcFunction extends EmptyNpcFunction {
    public SelfUpdateSavedNpcFunction(String name) {
        super(name, ImmutableList.of());
    }

    public SelfUpdateSavedNpcFunction(String name, ImmutableList<NpcFunctionValue<?>> requiredValues) {
        super(name, requiredValues);
    }

    @Override
    protected void function(Npc npc, NpcFunctionContext functionContext) throws Exception {
       // npc.deleteViewers();
    }

    @Override
    protected boolean isSaveAllowed() {
        return true;
    }
}
