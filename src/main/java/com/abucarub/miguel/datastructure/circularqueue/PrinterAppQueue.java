package com.abucarub.miguel.datastructure.circularqueue;

/**
 * 
 * @author miguel.abucarub.neto
 * @Date 17-02-2021
 */
public class PrinterAppQueue {

	public static void main(String[] args) {
		// Criar a fila de impressao - tamanho da fila no parametro no construtor 
		Queue<PrintJob> printerQueue = new CircularQueue(20);

		// Criar o runnable do printer
		Runnable printer = new Printer("MyPrinter", printerQueue);

		// Cria a thread do printer
		Thread thread1 = new Thread(printer, "Printer");
		thread1.start();


		// Criar o runnable do producer
		Runnable producer = new Producer("MyProducer", printerQueue);

		// Cria a thread do producer
		Thread thread2 = new Thread(producer, "Producer");
		thread2.start();

	}

}
