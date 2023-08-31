package State;

public enum StateEnum implements State {
    DAY_STATE {
   
        @Override
        public void doUse(Context context) {
            context.recordLog("Use the Safe (Day)");
        }

        @Override
        public void doAlarm(Context context) {
            context.callSecurityCenter("Emergency Alarm(Day)");
        }

        @Override
        public void doPhone(Context context) {
            context.callSecurityCenter("Call(Day)");
        }

        @Override
        public String toString() {
            return "[Day]";
        }
    },
    
    NIGHT_STATE {
      
        @Override
        public void doUse(Context context) {
            context.recordLog("Use the Safe (Night)");
        }

        @Override
        public void doAlarm(Context context) {
            context.callSecurityCenter("Emergency Alarm(Night)");
        }

        @Override
        public void doPhone(Context context) {
            context.callSecurityCenter("Call(Night)");
        }

        @Override
        public String toString() {
            return "[Night]";
        }
    },
    LUNCH_STATE {
       

        @Override
        public void doUse(Context context) {
            context.recordLog("Use the Safe (Lunch)");
        }

        @Override
        public void doAlarm(Context context) {
            context.callSecurityCenter("Emergency Alarm(Lunch)");
        }

        @Override
        public void doPhone(Context context) {
            context.callSecurityCenter("Call(Lunch)");
        }

        @Override
        public String toString() {
            return "[Lunch]";
        }
    };

}
