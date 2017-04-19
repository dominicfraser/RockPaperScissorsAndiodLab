package example.codeclan.com.rockpaperscissors;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by user on 19/04/2017.
 */

public class GameResult implements Parcelable {

    private String playerChoice;
    private String computerChoice;
    private String result;

    public GameResult(String playerChoice, String computerChoice, String result){
        this.playerChoice = playerChoice;
        this.computerChoice = computerChoice;
        this.result = result;
    }

    public String getPlayerChoice(){
        return this.playerChoice;
    }

    public String getComputerChoice(){
        return this.computerChoice;
    }

    public String getResult(){
        return this.result;
    }

//    PARCELABLE
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags)
    {
        out.writeString(playerChoice);
        out.writeString(computerChoice);
        out.writeString(result);
    }

    private static GameResult readFromParcel(Parcel in) {
        String playerChoice = in.readString();
        String computerChoice = in.readString();
        String result = in.readString();
        return new GameResult(playerChoice, computerChoice, result);
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
    {
        public GameResult createFromParcel(Parcel in)
        {
            return readFromParcel(in);
        }

        public GameResult[] newArray(int size) {
            return new GameResult[size];
        }
    };



}
