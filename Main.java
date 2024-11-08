package com.miproyecto.personas;

public class Main {

    public static void main(String[] args) {
        Persona doctor = new Doctor("Dr. Ventura", 55, "Cardiología");
        Persona deportista = new Deportista("Jonathan Rosales", 22, "Fútbol");

        doctor.mostrarInformacion();
        System.out.println();
        deportista.mostrarInformacion();
    }

    public static abstract class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public abstract void mostrarInformacion();
    }

    public static class Doctor extends Persona {
        private String especialidad;

        public Doctor(String nombre, int edad, String especialidad) {
            super(nombre, edad);
            this.especialidad = especialidad;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        @Override
        public void mostrarInformacion() {
            System.out.println("Doctor: " + getNombre());
            System.out.println("Edad: " + getEdad());
            System.out.println("Especialidad: " + especialidad);
        }
    }

    public static class Deportista extends Persona {
        private String deporte;

        public Deportista(String nombre, int edad, String deporte) {
            super(nombre, edad);
            this.deporte = deporte;
        }

        public String getDeporte() {
            return deporte;
        }

        public void setDeporte(String deporte) {
            this.deporte = deporte;
        }

        @Override
        public void mostrarInformacion() {
            System.out.println("Deportista: " + getNombre());
            System.out.println("Edad: " + getEdad());
            System.out.println("Deporte: " + deporte);
        }
    }
}