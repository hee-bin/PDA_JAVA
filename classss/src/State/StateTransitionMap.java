package State;

import java.util.*;

// StateTransitionMap 클래스는 시간대별 상태 전환 규칙을 관리하는 클래스입니다.
public class StateTransitionMap {
    private Map<HourRange, StateEnum> transitionMap = new HashMap<>();

    // 생성자: 초기 상태 전환 규칙을 설정합니다.
    public StateTransitionMap() {
        // Day State
        transitionMap.put(new HourRange(9, 11), StateEnum.DAY_STATE);
        transitionMap.put(new HourRange(15, 17), StateEnum.DAY_STATE);

        // Lunch State
        transitionMap.put(new HourRange(12, 14), StateEnum.LUNCH_STATE);

        // Night State
        transitionMap.put(new HourRange(18, 8), StateEnum.NIGHT_STATE);
    }

    // 주어진 시간에 해당하는 상태를 반환합니다.
    public StateEnum getStateForHour(int hour) {
        for (Map.Entry<HourRange, StateEnum> entry : transitionMap.entrySet()) {
            if (entry.getKey().containsHour(hour)) {
                return entry.getValue();
            }
        }
        return null;
    }

    // 시간 범위를 나타내는 내부 클래스
    private static class HourRange {
        private int startHour;
        private int endHour;

        public HourRange(int startHour, int endHour) {
            this.startHour = startHour;
            this.endHour = endHour;
        }

        // 주어진 시간이 범위에 속하는지 여부를 반환합니다.
        public boolean containsHour(int hour) {
            if (startHour <= endHour) {
                return hour >= startHour && hour <= endHour;
            } else {
                return hour >= startHour || hour <= endHour;
            }
        }
    }
}
