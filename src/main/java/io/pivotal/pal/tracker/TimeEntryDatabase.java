package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TimeEntryDatabase {
    private List<TimeEntry> timeEntryList;


    public List<TimeEntry> createRepo(){


        if(timeEntryList==null){

            timeEntryList = new ArrayList<>();

        }

        return timeEntryList;


    }
    public TimeEntry addRecord(TimeEntry te,long id){

        TimeEntry t = new TimeEntry(id, te.getProjectId(), te.getUserId(), te.getDate(), te.getHours());

        timeEntryList.add(t);

        return t;


    }

    public List<TimeEntry> getRepo(){

        this.createRepo();
        return timeEntryList ;


    }

    public TimeEntry findbyId(long tEntryId) {

        for (TimeEntry timEntry : timeEntryList) {

            if (timEntry.getId() == tEntryId) {
                return timEntry;

            }

        }
        return null;
    }
    public void deleteById(long tEntryId) {

        Iterator<TimeEntry> iterator = timeEntryList.iterator();

        while  (iterator.hasNext()) {

            TimeEntry mp = iterator.next();

            if (mp.getId() == tEntryId) {
                iterator.remove();
                // iterator used for concurrent modification
            }

        }
    }

    public TimeEntry updtaeById(long id, TimeEntry tEntry) {

        for (TimeEntry timEntry : timeEntryList) {

            if (timEntry.getId() == id) {

                timEntry.setDate(tEntry.getDate());
                timEntry.setHours(tEntry.getHours());
                timEntry.setProjectId(tEntry.getProjectId());
                timEntry.setUserId(tEntry.getUserId());
                return timEntry;
            }

        }
        return new TimeEntry() ;
    }

}
