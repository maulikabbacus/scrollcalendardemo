package and.scroll.calendar.contract;

import android.support.annotation.NonNull;

import and.scroll.calendar.data.CalendarDay;
import and.scroll.calendar.data.CalendarMonth;

/**
 * Created by rafal.manka on 11/09/2017
 */
public interface ClickCallback {
    void onCalendarDayClicked(@NonNull CalendarMonth calendarMonth, @NonNull CalendarDay calendarDay);

}
