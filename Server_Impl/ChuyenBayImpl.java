package Server_Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import InterFace.ChuyenBayService;

public class ChuyenBayImpl extends UnicastRemoteObject implements ChuyenBayService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ChuyenBayImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String information(int sohieu, String ngaygiobay, String noidi, String noiden, String thoigianbay, int tongsoghe,
			int ghedaban, int ghecontrong) throws RemoteException {
		// TODO Auto-generated method stub
		return " Số hiệu :"+sohieu+"\n Ngay va gio :"+ngaygiobay+"\n Noi di :"+noidi+"\n Noi den :"+noiden+"\n Thoi gian bay :"
				+thoigianbay+"\n TOng so ghe:"+tongsoghe+"\n So ghe da ban :"+ghedaban+"\n So ghe con trong :"+ghecontrong+"\n";
	}

	@Override
	public double muave(int sove, double giave) throws RemoteException {
		
		return sove * giave;
	}

	@Override
	public double trave(int sove, double giave) throws RemoteException {
		return (sove * giave)/2;
	}
		
}
