package udit.tost;

import android.content.Context;
import android.widget.Toast;

public class Tost {

    public static  void Simpletost(Context context, String Message){
        Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();
    }
}
