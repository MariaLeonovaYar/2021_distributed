package ru.krista.uniyar;

import io.grpc.stub.StreamObserver;
import io.quarkus.calc.CalculatorProto;

import javax.inject.Singleton;

@Singleton
public class CalculatorService extends io.quarkus.calc.CalculatorServiceGrpc.CalculatorServiceImplBase{
    @Override
    public void calculate(CalculatorProto.CalculatorRequest request, StreamObserver<CalculatorProto.CalculatorResponse> responseObserver) {

        // Переделать double на bigDecimal и реализовать операции через add,substract... if можно заменить на case
        double number1 = request.getNumber1();
        double number2 = request.getNumber2();
        int operation = request.getOperationValue();
        double result = 0;

        if (operation == 0)
        {
             result = number1 + number2;
        }

       responseObserver.onNext(CalculatorProto.CalculatorResponse.newBuilder().setResult(result).build());
       responseObserver.onCompleted();

    }


}
