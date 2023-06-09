package modules.helloWorld.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class BranchTest extends AbstractDomainTest<Branch> {

	@Override
	protected Branch getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Branch.MODULE_NAME, Branch.DOCUMENT_NAME);
	}
}