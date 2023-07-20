package bancario;

import java.io.*;

public class Principal {

	static InputStreamReader isr;
	static BufferedReader br;
	static Cuenta objCuenta;
	static Cliente objCliente;
	static int consignar, retirar, saldo;
	static String op, numC, consig, retir, sald;
		
	public static void main(String[] args)throws IOException {
		
		isr = new InputStreamReader(System.in);
		br =new BufferedReader(isr);
		
		while(true){
			
			System.out.println("\n\n    ---- BancoBancario ----    ");
			System.out.println("1: Crear Cuenta");
			System.out.println("2: Crear Cliente");
			System.out.println("3: Consultar Saldo");
			System.out.println("4: Consignar");
			System.out.println("5: Retirar");
			System.out.println("6: Transferir");
			System.out.println("7: Ver Clientes");
			System.out.println("8: Ver Cuentas");
			System.out.println("9: Salir");
			System.out.print("\n Digite Opción : ");
			
			op=br.readLine();
			
			if(op.equals("1")){
				objCuenta = new Cuenta(); 
			}
			if(op.equals("2")){
				objCliente = new Cliente(false);
			}
			if(op.equals("3")){
				int r;
				System.out.println("Digite número cuenta");
				numC=br.readLine();
				r=Cuenta.bCuenta(numC);
				if(r==0){
					System.out.println("Cuenta no Existe");
				}else{
					System.out.println("El saldo es "+Cuenta.bSaldo(numC));
				}
			}
			
			if(op.equals("4")){
				int r;
				System.out.println("Digite número cuenta");
				numC=br.readLine();
				r=Cuenta.bCuenta(numC);
				if(r==0){
					System.out.println("Cuenta no Existe");
				}else{
					System.out.println("Digite Cantidad a Consignar");
					consig = br.readLine();
					consignar = Integer.parseInt(consig);
					Cuenta.consignar(numC, consignar);
					System.out.println("Consignación Exitosa de "+consignar+ " en la cuenta "+numC);
				}
			}
			
			if(op.equals("5")){
				int r;
				System.out.println("Digite número cuenta");
				numC=br.readLine();
				r=Cuenta.bCuenta(numC);
				if(r==0){
					System.out.println("Cuenta no Existe");
				}else{
					System.out.println("Digite Cantidad a Retirar");
					retir = br.readLine();
					retir=retir.trim();
					retirar = Integer.parseInt(retir);
					sald=Cuenta.bSaldo(numC);
					sald=sald.trim();
					saldo = Integer.parseInt(sald);
					
					if(retirar>saldo){
						System.out.println("Saldos Insuficientes...");	
					}else{
						Cuenta.Retirar(numC, retirar);
						System.out.println("Transacción Exitosa...");
					}
				}
			}
			if(op.equals("6")){
				System.out.println("Esta opción queda para que ud la termine.... :)");
			}
			if(op.equals("7")){
				Cliente.verClientes();	
			}
			if(op.equals("8")){
				Cuenta.verCuentas();
			}
			if(op.equals("9")){
				System.out.print("Gracias por utilizar nuestros servicios");
				System.exit(0);
			}
		}

	}

}
