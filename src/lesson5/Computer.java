package lesson5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    private int cpu;
    private int ram;
    private int hardDisk;
    private int currentWorkCycle; //текущий цикл
    private static int MAX_WORK_CYCLES = 5; //максимальное количество циклов
    private boolean isComputerOn;
    private boolean isComputerBurned;

    public Computer(int cpu, int ram, int hardDisk, boolean isComputerOn) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.isComputerOn = isComputerOn;
        this.currentWorkCycle = 0;
        this.isComputerBurned = false;
    }

    //включение компьютера
    //isSuccessfulStart: принимает int, 1 - успешное включение, 0 - включение с ошибкой
    public void turnOn(int isSuccessfulStart) {
        if (isSuccessfulStart == 1) {
            //проверяем включен ли уже компьютер
            if (isComputerOn == false) {
                //проверяем сгоревший компьютер или нет и сколько рабочих циклов он выполнил
                if (isComputerBurned == false) {
                    if (isOutOfLimits()) {
                        System.out.println();
                        isComputerOn = true;
                        successfulTurnOnWarning();
                        //currentWorkCycles++;
                    } else {
                        workCyclesLimitWarning();
                        computerBurned();
                    }
                } else {
                    computerBurned();
                }
            } else {
                computerAlreadyTurnedOnWarning();
            }
        } else {
            //если включение не успешно, обрабатываем ошибку
            exceptionFound(false);
        }
    }


    //выключение компьютера
    //isSuccessfulEnd показывает выключилися компьютер успешно или с ошибкой

    public void turnOff(int isSuccessfulEnd) {
        if (isSuccessfulEnd == 1) {
            if (isComputerOn == true) {
                System.out.println();
                successfulTurnOffWarning();
                currentWorkCycle++;
                isComputerOn = false;
            }
        } else {
            exceptionFound(false);
        }
    }

    //проверка выработки ресурса
    public boolean isOutOfLimits() {
        if (currentWorkCycle < MAX_WORK_CYCLES) {
            return true;
        } else {
            return false;
        }
    }

    //обнаружение ошибки
    private void exceptionFound(boolean isGeneratedException) {
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(2);
        Scanner sc = new Scanner(System.in);
        if (!isGeneratedException) {
            errorFoundWarning();
        }
        promptMessage();
        try {
            //пользователь вводит число
            int number = sc.nextInt();
            //либо успешно и компьютер выключается
            if (number == 0 || number == 1) {
                if (number == rndNumber) {
                    successfulGuess();
                } else {
                    computerBurned();
                }
                //либо компьютер сгорает
            } else {
                incorrectInputWarning();
                computerBurned();
            }
        } catch (InputMismatchException exception) {
            incorrectInputWarning();
            computerBurned();
            //exceptionFound(true);
        }
    }

    //вывод полей класса
    @Override
    public String toString() {
        return "Computer{" +
                "Параметры cpu=" + cpu +
                ", Параметры ram=" + ram +
                ", Параметры hardDisk=" + hardDisk +
                ", Текущее количество отработанных циклов=" + currentWorkCycle +
                '}';
    }

    private void errorFoundWarning() {
        System.out.println("Обнаружена ошибка!");
    }

    private void successfulGuess() {
        System.out.println("Вы угадали! Компьютер выключается!");
    }

    private void incorrectInputWarning() {
        System.out.println("Неверный ввод!");
    }

    private void promptMessage() {
        System.out.println("Введите число от 0 до 1: ");
    }

    private void computerBurned() {
        System.out.println("Компьютер сгорел!");
        isComputerBurned = true;
    }

    private void successfulTurnOffWarning() {
        System.out.println("Успешное завершение работы!");
    }

    private void computerAlreadyTurnedOnWarning() {
        System.out.println("Компьютер уже включен");
    }

    private void successfulTurnOnWarning() {
        System.out.println("Успешное включение!");
    }

    private void workCyclesLimitWarning() {
        System.out.println("Превышено число рабочих циклов!");
    }
}
