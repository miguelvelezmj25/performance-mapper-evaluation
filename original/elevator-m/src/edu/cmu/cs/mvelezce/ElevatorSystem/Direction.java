package edu.cmu.cs.mvelezce.ElevatorSystem;

/**
 * Created by mvelezce on 6/22/17.
 */
public enum Direction {
    up {
        @Override
        public Direction reverse() {
            return down;
        }
    },
    down {
        @Override
        public Direction reverse() {
            return up;
        }
    };

    //        @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public abstract Direction reverse();
}
