package ru.krista.uniyar;

import io.quarkus.calc.CalculatorProto.CalculatorRequest;
import io.quarkus.grpc.runtime.annotations.GrpcService;
import io.quarkus.calc.CalculatorServiceGrpc;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calculator")
public class ExampleResource {
    @Inject
    @GrpcService("calculator")
    CalculatorServiceGrpc.CalculatorServiceBlockingStub client;

    // Доделать вычисления
    @GET
    @Path("/{number1} {number2} {operation}")
    public double calculator(@PathParam("number1") double number1, @PathParam("number2") double number2, @PathParam("operation") int operation) {
//       client.calculate(CalculatorRequest.newBuilder().setNumber1(number1).build());
//       client.calculate(CalculatorRequest.newBuilder().setNumber2(number2).build());
//       client.calculate(CalculatorRequest.newBuilder().setOperationValue(operation).build());

    }
}
