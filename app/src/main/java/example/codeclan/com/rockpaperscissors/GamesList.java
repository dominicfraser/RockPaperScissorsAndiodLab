package example.codeclan.com.rockpaperscissors;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class GamesList implements Parcelable {

    private ArrayList<GameResult> list;

    public GamesList(){
        list = new ArrayList<GameResult>();
    }

    public ArrayList<GameResult> getList(){
        return new ArrayList<GameResult>(list);
    }

    public void addToList(GameResult gameResult){
        list.add(gameResult);
    }

    public int sizeOfList(){
        return list.size();
    }

    public GameResult entry(int index) {
        return list.get(index);
    }

    //    PARCELABLE
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags)
    {
        out.writeTypedList(list);
    }

    private GamesList(Parcel in) {
        in.readTypedList(list, GameResult.CREATOR);
    }

    public static final Parcelable.Creator<GamesList> CREATOR =
            new Parcelable.Creator<GamesList>() {
                public GamesList createFromParcel(Parcel in) {
                    return new GamesList(in);
                }

                public GamesList[] newArray(int size) {
                    return new GamesList[size];
                }
            };
}


