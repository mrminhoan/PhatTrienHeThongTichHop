package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	
	protected HelloImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String hello(String name) throws RemoteException {
		System.out.println("Ten la: " + name);
		return "xin chao" + name;
	}
	public static void main(String[] args) {
		try {
			Naming.rebind("rmi://localhost:1099/5000", new HelloImpl());
			System.out.println("Server da san sang");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
