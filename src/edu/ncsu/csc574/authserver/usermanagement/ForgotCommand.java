package edu.ncsu.csc574.authserver.usermanagement;

import edu.ncsu.csc574.emailserver.commlayer.IUserContext;
import edu.ncsu.csc574.emailserver.workflowmanager.ICommandProcessor;
import edu.ncsu.csc574.emailserver.workflowmanager.IRequest;
import edu.ncsu.csc574.emailserver.workflowmanager.IResponse;

public class ForgotCommand implements ICommandProcessor {

	@Override
	public IResponse process(IUserContext ctx, IRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
