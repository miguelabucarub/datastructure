package com.abucarub.miguel.datastructure.circularqueue;

import java.util.Arrays;

/**
 * 
 * CircularQueue
 * A classe que implementa Queue.
 * 
 */
class CircularQueue implements Queue<PrintJob> {

	private volatile int currentSize; // Tamanho atual da fila circular
	private PrintJob[] circularQueueElements;
	private int maxSize; // Maximo tamanho da fila

	private int rear;// posição traseira da fila circular (novo elemento enfileirado na parte traseira).
	private int front; // posição frontal da fila circular (o elemento será retirado da frente).

	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		circularQueueElements = new PrintJob[this.maxSize];
		currentSize = 0;
		front = 0;
		rear = 0;
	}

	/**
	 * Enqueue elements to rear. Enfileira os itens
	 */
	public synchronized void enqueue(PrintJob item) throws FullQueueException {

		if (isFull()) {
			throw new FullQueueException("Circular Queue is full. Element cannot be added");
		}

		circularQueueElements[rear] = item;
		rear = (rear + 1) % circularQueueElements.length;
		currentSize++;
	}

	/**
	 * Dequeue element from Front.
	 */
	public synchronized PrintJob dequeue() throws EmptyQueueException {

		if (isEmpty()) {
			return null;
		}

		PrintJob deQueuedElement = circularQueueElements[front];
		circularQueueElements[front] = null;
		front = (front + 1) % circularQueueElements.length;
		currentSize--;

		return deQueuedElement;
	}

	/**
	 * Check if queue is full.
	 */
	public boolean isFull() {
		return (currentSize == circularQueueElements.length);
	}

	/**
	 * Check if Queue is empty.
	 */
	public boolean isEmpty() {
		return (currentSize == 0);
	}

	@Override
	public String toString() {
		return "CircularQueue [" + Arrays.toString(circularQueueElements) + "]";
	}

}
