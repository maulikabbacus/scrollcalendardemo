# Scroll Calendar



## Installing

Improt the library into gradle
Step 1. in project gradle file

		allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.maulikabbacus:scrollcalendardemo:1.0.1'
	}
	
### Getting Started

Define layout in your xml file

```xml
<and.scroll.calendar.ScrollCalendar
        android:id="@+id/scrollCalendar"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        scrollcalendar:backgroundColor="@android:color/transparent"
        scrollcalendar:currentDayBackground="@drawable/scrollcalendar_circle_outline"
        scrollcalendar:currentDayTextColor="@android:color/darker_gray"
        scrollcalendar:customFont="fonts/montserrat-light.otf"
        scrollcalendar:disabledBackgroundColor="@android:color/transparent"
        scrollcalendar:disabledTextColor="@android:color/darker_gray"
        scrollcalendar:fontColor="@android:color/black"
        scrollcalendar:fontSize="18dp"
        scrollcalendar:selectedBackground="@drawable/scrollcalendar_circle_full"
        scrollcalendar:selectedBackgroundBeginning="@drawable/scrollcalendar_range_start"
        scrollcalendar:selectedBackgroundEnd="@drawable/scrollcalendar_range_end"
        scrollcalendar:selectedBackgroundMiddle="@drawable/scrollcalendar_range_middle"
        scrollcalendar:selectedTextColor="@android:color/white"
        scrollcalendar:unavailableBackground="@drawable/scrollcalendar_strikethrough"
        scrollcalendar:unavailableTextColor="@android:color/darker_gray" />
```

Reference the widget in your Activity/Fragment and set callback

```java Code
ScrollCalendar scrollCalendar = (ScrollCalendar) findViewById(R.id.scrollCalendar);
scrollCalendar.setOnDateClickListener(new OnDateClickListener() {
    @Override
    public void onCalendarDayClicked(int year, int month, int day) {
        // user clicked on a specific date on the calendar
    }
});
scrollCalendar.setDateWatcher(new DateWatcher() {
    @Override
    public int getStateForDate(int year, int month, int day) {
        //    CalendarDay.DEFAULT,
        //    CalendarDay.DISABLED,
        //    CalendarDay.TODAY,
        //    CalendarDay.UNAVAILABLE,
        //    CalendarDay.SELECTED,
        return CalendarDay.DEFAULT;
    }
});
scrollCalendar.setMonthScrollListener(new MonthScrollListener() {
    @Override
    public boolean shouldAddNextMonth(int lastDisplayedYear, int lastDisplayedMonth) {
        // return false if you don't want to show later months
        return true;
    }
    @Override
    public boolean shouldAddPreviousMonth(int firstDisplayedYear, int firstDisplayedMonth) {
        // return false if you don't want to show previous months
        return true;
    }
});

