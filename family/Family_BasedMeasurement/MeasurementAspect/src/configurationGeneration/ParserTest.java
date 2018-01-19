package configurationGeneration;

import static org.junit.Assert.fail;

import java.io.StringReader;

import org.junit.Test;

import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.solver.Solver;

public class ParserTest {

	@Test
	public void test() throws Exception {
		
		FeatureModelParser p = new FeatureModelParser(new FeatureModelScanner(new StringReader("C or (A implies B)")));
		
		Constraint modelConstraints;
		// parsing happens here
		modelConstraints = (Constraint) p.parse().value;

		// evaluation
		Model m = new CPModel();
		m.addConstraint(modelConstraints);
		Solver solver;
		solver = new CPSolver();
		solver.read(m);
		solver.generateSearchStrategy();

		int solutions = 0;
		solver.solve();
		if (solver.isFeasible()) {
			do {
				solutions++;
				System.out.println(solver.solutionToString());
			} while (solver.nextSolution());
		}
		if (solutions > 0) {
			System.out.println("solutions: " + solutions);
			
		} else {
			fail("infeasible!?");
		}
	}

}
