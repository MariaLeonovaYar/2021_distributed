package ru.krista.uniyar;

import io.grpc.stub.StreamObserver;
import io.quarkus.calc.CalculatorProto;
import io.vertx.codegen.Case;

import javax.inject.Singleton;

@Singleton
public class CalculatorService extends io.quarkus.calc.CalculatorServiceGrpc.CalculatorServiceImplBase{
    @Override
    public void calculate(CalculatorProto.CalculatorRequest request, StreamObserver<CalculatorProto.CalculatorResponse> responseObserver) {

        double number1 = request.getNumber1();
        double number2 = request.getNumber2();
        int operation = request.getOperationValue();
        double result = 0;

        switch (operation)
        {
            case 0:
                result = number1 + number2;
                break;
            case 1:
                result = number1 - number2;
                break;
            case 2:
                result = number1*number2;
                break;
            case 3:
                    result = number1/number2;
                    break;
            default:
                result = 0;
                break;
        }

       responseObserver.onNext(CalculatorProto.CalculatorResponse.newBuilder().setResult(result).build());
       responseObserver.onCompleted();

    }


}
