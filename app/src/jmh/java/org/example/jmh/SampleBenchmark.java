package org.example.jmh;

import org.example.Simulation;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 2)
@Warmup(iterations = 2)

public class SampleBenchmark {
    private Simulation simulation;

    @Param({"10", "100", "1000", "5000", "10000"})
    private int steps;

    @Setup(Level.Iteration)
    public void setup() {
        simulation = new Simulation();
    }

    @Benchmark
    public void benchmarkSteps(Blackhole bh) {
        int result = simulation.Steps(steps);
        bh.consume(result);
    }
}

