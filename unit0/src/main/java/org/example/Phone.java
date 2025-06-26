package org.example;

class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name, String cN) {
        System.out.println("Звонит " + name + " с номера " + cN);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String[] numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "Номер: " + number + " Модель: " + model + " Вес: " + weight + " кг";
    }
}
