class BBRaceway implements Track {
    @Override
    public void trackInfo() {
        System.out.println("Track: BB Raceway (Japan)");
    }
    @Override
    public void crossStartLine() {
        System.out.println("Crossing the start line on BBRaceway (Japan)");
    }
    @Override
    public void crossFinishLine() {
        System.out.println("Crossing the finish line on BBRaceway (Japan)");
    }
}
