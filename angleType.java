String angleType(int measure) {
    if(measure<90)
        return "acute";
    else if(measure==90)
        return "right";
    else if(measure==180)
        return "straight";
    return "obtuse";
}
