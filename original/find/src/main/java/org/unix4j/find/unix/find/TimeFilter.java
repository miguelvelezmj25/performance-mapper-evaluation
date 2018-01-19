package org.unix4j.find.unix.find;

import java.io.File;
import java.io.FileFilter;
import java.util.Date;

/**
 * File filter based on last modified, last accessed or created time of the
 * file.
 */
class TimeFilter implements FileFilter {
    private final Date time;
    private final TimeType timeType;
    private final TimeComparator comparator;

    public TimeFilter(Date time, FindArguments arguments) {
        this(time, TimeFilter.getTimeType(arguments), TimeFilter.getTimeComparator(arguments));
    }

    public TimeFilter(Date time, TimeType timeType, TimeComparator comparator) {
        this.time = time;
        this.timeType = timeType;
        this.comparator = comparator;
    }

    private static TimeType getTimeType(FindArguments arguments) {
        TimeType timeType = new TimeType.Modified();

        if(arguments.isTimeAccess()) {
            timeType = new TimeType.Access();
        }
        else if(arguments.isTimeCreate()) {
            timeType = new TimeType.Create();
        }

        return timeType;
    }

    private static TimeComparator getTimeComparator(FindArguments arguments) {
        TimeComparator timeComparator = new TimeComparator.Newer();

        if(arguments.isTimeOlder()) {
            timeComparator = new TimeComparator.Older();
        }

        return timeComparator;
    }

    @Override
    public boolean accept(File file) {
        return comparator.accept(file, timeType, time);
    }

    public static abstract class TimeType {

        abstract public long getTime(File file);

        public static class Create extends TimeType {
            @Override
            public long getTime(File file) {
                return FileAttributes.INSTANCE.getCreationTime(file);
            }
        }

        public static class Access extends TimeType {
            @Override
            public long getTime(File file) {
                return FileAttributes.INSTANCE.getLastAccessedTime(file);
            }
        }

        public static class Modified extends TimeType {
            @Override
            public long getTime(File file) {
                return FileAttributes.INSTANCE.getLastModifiedTime(file);
            }
        }
    }

//    public static enum TimeType implements Optionable<FindOption> {
//        Create(FindOption.timeCreate) {
//            @Override
//            public long getTime(File file) {
//                return FileAttributes.INSTANCE.getCreationTime(file);
//            }
//        },
//        Access(FindOption.timeAccess) {
//            @Override
//            public long getTime(File file) {
//                return FileAttributes.INSTANCE.getLastAccessedTime(file);
//            }
//        },
//        Modified(FindOption.timeModified) {
//            @Override
//            public long getTime(File file) {
//                return FileAttributes.INSTANCE.getLastModifiedTime(file);
//            }
//        };
//
//        private final FindOption option;
//
//        private TimeType(FindOption option) {
//            this.option = option;
//        }
//
//        abstract public long getTime(File file);
//
//        @Override
//        public FindOption getOption() {
//            return option;
//        }
//    }

    public static abstract class TimeComparator {

        abstract public boolean accept(File file, TimeType timeType, Date time);

        public static class Older extends TimeComparator {
            @Override
            public boolean accept(File file, TimeType timeType, Date time) {
                return timeType.getTime(file) <= time.getTime();
            }
        }

        public static class Newer extends TimeComparator {
            @Override
            public boolean accept(File file, TimeType timeType, Date time) {
                return timeType.getTime(file) >= time.getTime();
            }
        }
    }

//    public static enum TimeComparator implements Optionable<FindOption> {
//        Older(FindOption.timeOlder) {
//            @Override
//            public boolean accept(File file, TimeType timeType, Date time) {
//                return timeType.getTime(file) <= time.getTime();
//            }
//        },
//        Newer(FindOption.timeNewer) {
//            @Override
//            public boolean accept(File file, TimeType timeType, Date time) {
//                return timeType.getTime(file) >= time.getTime();
//            }
//        };
//
//        private final FindOption option;
//
//        private TimeComparator(FindOption option) {
//            this.option = option;
//        }
//
//        abstract public boolean accept(File file, TimeType timeType, Date time);
//
//        @Override
//        public FindOption getOption() {
//            return option;
//        }
//    }

}
