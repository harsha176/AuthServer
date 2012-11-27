package edu.ncsu.csc574.authserver.module;

import edu.ncsu.csc574.authserver.usermanagement.AuthCommand;
import edu.ncsu.csc574.authserver.usermanagement.ValidateCommand;
import edu.ncsu.csc574.module.BasicRequestProcessor;
import edu.ncsu.csc574.module.IRequest;
import edu.ncsu.csc574.module.IRequestProcessor;
import edu.ncsu.csc574.module.IResponse;
import edu.ncsu.csc574.module.IUserContext;

public class AuthServerRequestProcessor extends BasicRequestProcessor {

	@Override
	public IResponse process(IUserContext ctx, IRequest request)
			throws Exception {
		return super.process(ctx, request);
	}

	@Override
	public void registerCommand(String name, Class cmd) {
		super.registerCommand(name, cmd);
	}

	public static IRequestProcessor getInstance() {
		if (instance == null) {
			instance = new AuthServerRequestProcessor();
			//register each command
			instance.registerCommand("AUTHENTICATE", AuthCommand.class);
			instance.registerCommand("VALIDATE", ValidateCommand.class);
			instance.registerCommand("CREATE", CreateCommand.class);
			instance.registerCommand(cmd, cmdProcessor)
			
		}
		return instance;
	}

}
