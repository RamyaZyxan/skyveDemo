package modules.helloWorld.Demonstration.actions;

import org.skyve.metadata.controller.ServerSideAction;
import org.skyve.metadata.controller.ServerSideActionResult;
import org.skyve.web.WebContext;

import modules.helloWorld.domain.Demonstration;

public class EchoText implements ServerSideAction<Demonstration> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1739308732295447489L;

	@Override
	public ServerSideActionResult<Demonstration> execute(Demonstration bean, WebContext webContext) throws Exception {

		bean.setOutputText(bean.getInputText());

		return new ServerSideActionResult<>(bean);
	}

}
