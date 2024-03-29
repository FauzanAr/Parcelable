package android.jplas.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Biodata implements Parcelable {
    private String nama;
    private String email;
    private int nomor;

    public Biodata(String nama, String email, int nomor) {
        this.nama = nama;
        this.email = email;
        this.nomor = nomor;
    }

    protected Biodata(Parcel in) {
        nama = in.readString();
        email = in.readString();
        nomor = in.readInt();
    }

    public static final Creator<Biodata> CREATOR = new Creator<Biodata>() {
        @Override
        public Biodata createFromParcel(Parcel in) {
            return new Biodata(in);
        }

        @Override
        public Biodata[] newArray(int size) {
            return new Biodata[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(email);
        parcel.writeInt(nomor);
    }
}
