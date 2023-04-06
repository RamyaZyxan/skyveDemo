package modules.helloWorld.Demonstration.actions;

import modules.helloWorld.domain.Demonstration;
import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractActionTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractActionTest} to create your own tests for this action.
 */
public class EchoTextTest extends AbstractActionTest<Demonstration, EchoText> {

	@Override
	protected EchoText getAction() {
		return new EchoText();
	}

	@Override
	protected Demonstration getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Demonstration.MODULE_NAME, Demonstration.DOCUMENT_NAME);
	}
}