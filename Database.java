import java.util.Random;
public class Database {
    Random generator = new Random();
    String[] database = {"drain", "audio", "adore", "audit", "aroma", "oread", "urate","sauce",
            "adieu", "arise", "louie", "beach", "brain", "bread", "brush", "chair", "chest",
            "chord", "cloud", "dance", "diary", "drink", "earth", "flute", "fruit", "ghost",
            "grape", "green", "heart", "house", "juice", "light", "money", "music", "party",
            "plant", "radio", "river", "salad", "sheep", "shoes", "smile", "snack", "snake",
            "spice", "storm", "table", "tiger", "train", "water", "whale", "wheel", "woman",
            "world", "write", "youth", "ample", "ankle", "aural", "began", "blunt", "braid",
            "brisk", "bumpy", "chive", "clasp", "crave", "crest", "cumin", "drape", "dregs",
            "dumpy", "dusky", "elite", "enact", "fable", "flair", "fluke", "guaze", "giddy",
            "gorge", "gusty", "haste", "hovel", "hunch", "inept", "inert", "irate", "ivory",
            "joust", "jumpy", "knave", "knead", "kudos", "lanky", "latch", "lurid", "mirth",
            "mourn", "mower", "nerve", "nifty", "nudge", "olive", "onset", "ounce", "ovals",
            "pious", "pique", "plush", "poise", "quail", "quake", "quirk", "ravel", "runic",
            "sable", "spicy", "stilt", "swath", "swirl", "tonic", "triad", "tweak", "quart",
            "jumbo", "mixed", "grasp", "zebra", "waxen", "quint", "charm", "brick", "twine",
            "plate", "above", "acute", "alive", "alone", "angry", "aware", "awful", "basic",
            "black", "blind", "brave", "brief", "broad", "brown", "cheap", "chief", "civil",
            "clean", "clear", "close", "crazy", "daily", "dirty", "early", "empty", "equal",
            "exact", "extra", "faint", "false", "fifth", "final", "first", "fresh", "front",
            "giant", "grand", "great", "heavy", "human", "ideal", "joint", "large", "light",
            "loose", "lucky", "magic", "major", "minor", "moral", "naked", "nasty", "other",
            "outer", "plain", "prime", "prior", "proud", "quick", "quiet", "rapid", "ready",
            "right", "roman", "rough", "round", "royal", "sharp", "short", "sixth", "smart",
            "solid", "spare", "super", "thick", "third", "tough", "upset", "urban", "vague",
            "valid", "vital", "white", "whole", "wrong", "young"
    };
    public String getRandomWord() {
        return database[generator.nextInt(database.length)];
    }
}
