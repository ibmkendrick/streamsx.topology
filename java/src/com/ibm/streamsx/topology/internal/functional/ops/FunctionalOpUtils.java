package com.ibm.streamsx.topology.internal.functional.ops;

import com.ibm.streams.operator.OperatorContext;
import com.ibm.streamsx.topology.function.FunctionContext;
import com.ibm.streamsx.topology.internal.functional.FunctionalHandler;

class FunctionalOpUtils {
    
    
    static <T> FunctionalHandler<T> createFunctionHandler(OperatorContext context, FunctionContext functionContext, String functionalLogic) throws Exception {
        FunctionalHandler<T> handler = new FunctionalHandler<T>(functionContext, functionalLogic);
        return handler;
    }

}