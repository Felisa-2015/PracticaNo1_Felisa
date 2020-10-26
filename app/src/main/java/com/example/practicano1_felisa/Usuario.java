package com.example.practicano1_felisa;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;


public class Usuario implements Parcelable {
    private String nombre;
    private Integer edad;
    private String colorFavorito;
    private boolean status;

    public Usuario(String nombre, Integer edad, String colorFavorito) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorFavorito = colorFavorito;
        this.status = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", colorFavorito='" + colorFavorito + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeValue(this.edad);
        dest.writeString(this.colorFavorito);
        dest.writeByte(this.status ? (byte) 1 : (byte) 0);
    }

    public Usuario() {
    }

    protected Usuario(Parcel in) {
        this.nombre = in.readString();
        this.edad = (Integer) in.readValue(Integer.class.getClassLoader());
        this.colorFavorito = in.readString();
        this.status = in.readByte() != 0;
    }

    public static final Parcelable.Creator<Usuario> CREATOR = new Parcelable.Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel source) {
            return new Usuario(source);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };
}
