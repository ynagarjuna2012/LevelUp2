package io.github.ynagarjuna1995.levelup2.data.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geometry implements Parcelable {

    @SerializedName("location")
    @Expose
    public GooglePlaceLocation location;
    @SerializedName("viewport")
    @Expose
    public final static Parcelable.Creator<Geometry> CREATOR = new Creator<Geometry>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Geometry createFromParcel(Parcel in) {
            return new Geometry(in);
        }

        public Geometry[] newArray(int size) {
            return (new Geometry[size]);
        }

    }
            ;

    protected Geometry(Parcel in) {
        this.location = ((GooglePlaceLocation) in.readValue((GooglePlaceLocation.class.getClassLoader())));
    }

    public Geometry() {
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(location);
    }

    public int describeContents() {
        return 0;
    }
}
