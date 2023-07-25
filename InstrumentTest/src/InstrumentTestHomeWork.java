

		public class InstrumentTestHomeWork {

		    public static void main(String[] args) {

		        // Violin
		        StringBasedMusicalInstrument violin = new Violin();
		        violin.use();
		        violin.play();
		        violin.tuneStrings();
		        ((Violin) violin).bow(); // We need to cast violin to Violin to call the bow() method.

		        System.out.println("--------------------");

		        // Guitar
		        StringBasedMusicalInstrument guitar = new Guitar();
		        guitar.use();
		        guitar.play();
		        guitar.tuneStrings();
		        ((Guitar) guitar).pluck(); // We need to cast guitar to Guitar to call the pluck() method.

		        System.out.println("--------------------");

		        // Flute
		        AirBasedMusicalInstrument flute = new Flute();
		        flute.use();
		        flute.play();
		        ((Flute) flute).adjustAirPressure(); // We need to cast flute to Flute to call the adjustAirPressure() method.
		        ((Flute) flute).blow(); // We need to cast flute to Flute to call the blow() method.

		        System.out.println("--------------------");

		        // Harmonium
		        AirBasedMusicalInstrument harmonium = new Harmonium();
		        harmonium.use();
		        harmonium.play();
		        ((Harmonium) harmonium).adjustAirPressure(); // We need to cast harmonium to Harmonium to call the adjustAirPressure() method.
		        ((Harmonium) harmonium).pressKey(); // We need to cast harmonium to Harmonium to call the pressKey() method.

		        System.out.println("--------------------");

		        // Caliper
		        ScientificMeasuringInstrument caliper = new Caliper();
		        caliper.use();
		        ((Caliper) caliper).measure(); // We need to cast caliper to Caliper to call the measure() method.
		        ((Caliper) caliper).switchUnits(); // We need to cast caliper to Caliper to call the switchUnits() method.

		        System.out.println("--------------------");

		        // Pedometer
		        DailyMeasuringInstrument pedometer = new Pedometer();
		        pedometer.use();
		        ((Pedometer) pedometer).measure(); // We need to cast pedometer to Pedometer to call the measure() method.
		        ((Pedometer) pedometer).reset(); // We need to cast pedometer to Pedometer to call the reset() method.
		        ((Pedometer) pedometer).setGoal(10000); // We need to cast pedometer to Pedometer to call the setGoal() method.

		        System.out.println("--------------------");

		        // Synthesizer
		        ElectronicInstrument synthesizer = new Synthesizer();
		        synthesizer.use();
		        ((Synthesizer) synthesizer).playSound(); // We need to cast synthesizer to Synthesizer to call the playSound() method.
		        ((Synthesizer) synthesizer).changePatch(); // We need to cast synthesizer to Synthesizer to call the changePatch() method.

		        System.out.println("--------------------");

		        // Electronic Drum
		        ElectronicInstrument electronicDrum = new ElectronicDrum();
		        electronicDrum.use();
		        ((ElectronicDrum) electronicDrum).playSound(); // We need to cast electronicDrum to ElectronicDrum to call the playSound() method.
		        ((ElectronicDrum) electronicDrum).adjustVolume(); // We need to cast electronicDrum to ElectronicDrum to call the adjustVolume() method.

		        System.out.println("--------------------");

		        // Telescope
		        OpticalInstrument telescope = new Telescope();
		        telescope.use();
		        ((Telescope) telescope).observe(); // We need to cast telescope to Telescope to call the observe() method.
		        ((Telescope) telescope).adjustFocus(); // We need to cast telescope to Telescope to call the adjustFocus() method.

		        System.out.println("--------------------");

		        // Microscope
		        OpticalInstrument microscope = new Microscope();
		        microscope.use();
		        ((Microscope) microscope).observe(); // We need to cast microscope to Microscope to call the observe() method.
		        ((Microscope) microscope).magnify(); // We need to cast microscope to Microscope to call the magnify() method.

		        System.out.println("--------------------");

		        // Binoculars
		        OpticalInstrument binoculars = new Binoculars();
		        binoculars.use();
		        ((Binoculars) binoculars).observe(); // We need to cast binoculars to Binoculars to call the observe() method.
		        ((Binoculars) binoculars).adjustZoom(); // We need to cast binoculars to Binoculars to call the adjustZoom() method.
		    }
		}

	

//Instrument
//|
//+-- MusicalInstrument
//|   |
//|   +-- StringBasedMusicalInstrument
//|   |   |
//|   |   +-- Guitar
//|   |   |
//|   |   +-- Violin
//|   |
//|   +-- AirBasedMusicalInstrument
//|       |
//|       +-- Flute
//|       |
//|       +-- Harmonium
//|
//+-- MeasuringInstrument
//|   |
//|   +-- ScientificMeasuringInstrument
//|   |   |
//|   |   +-- Caliper
//|   |   |
//|   |   +-- Pedometer
//|   |
//|   +-- DailyMeasuringInstrument
//|       |
//|       +-- Pedometer
//|
//+-- ElectronicInstrument
//|   |
//|   +-- Synthesizer
//|   |
//|   +-- ElectronicDrum
//|
//+-- OpticalInstrument
//    |
//    +-- Telescope
//    |
//    +-- Microscope
//    |
//    +-- Binoculars


// here comes the instrument  

interface  Instrument 
{
	void use();
	//by default method is public and abstract
}

//here comes the 1 category of  instrument 

abstract class MusicalInstrument implements Instrument 
{
	abstract void play();
	
}

//  here comes the sub class of where we are using super class , or we can say here comes the object

abstract class  StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}

class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Guitar is in use..");
	}
	void play() {
		System.out.println("Guitar is playing.....");
	}
	void tuneStrings() {
		System.out.println("Guitar is  tunestrings..");
	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");
	}
}

class Violin extends StringBasedMusicalInstrument {
    
    public void use() {
        System.out.println("Violin is in use..");
    }

    void play() {
        System.out.println("Violin is playing.....");
    }

    
    void tuneStrings() {
        System.out.println("Violin is tuning strings..");
    }

    void bow() {
        System.out.println("Using a bow on the Violin...");
    }
}


// for 
abstract class AirBasedMusicalInstrument extends MusicalInstrument {
    abstract void adjustAirPressure();
}


class  Flute extends AirBasedMusicalInstrument {
    
	void play() {
		System.out.println("Playing Flute");
		
	}
    public void use() {
        System.out.println("Flute is in use..");
    }

    
    void adjustAirPressure() {
        System.out.println("Adjusting air pressure in the Flute..");
    }

    void blow() {
        System.out.println("Blowing air into the Flute...");
    }


}

class Harmonium extends AirBasedMusicalInstrument {
    
    public void use() {
        System.out.println("Harmonium is in use..");
    }

    
    void adjustAirPressure() {
        System.out.println("Adjusting air pressure in the Harmonium..");
    }

    void pressKey() {
        System.out.println("Pressing a key on the Harmonium...");
    }


	
	void play() {
		System.out.println("Playing Harmonium");
		
	}
}





abstract class DrumBasedMusicalInstrument extends MusicalInstrument {
    abstract void playDrum();
}

class Cajon extends DrumBasedMusicalInstrument {
    
	void play() {
		System.out.println("using Cajon");
		
	}
    public void use() {
        System.out.println("Cajon is in use..");
    }

    
    void playDrum() {
        System.out.println("Playing Cajon drum..");
    }

    void adjustSnare() {
        System.out.println("Adjusting snare on the Cajon...");
    }


	
	
}

class Djembe extends DrumBasedMusicalInstrument {
	
	void play() {
		System.out.println("using Djembe");
		
	}
    
    public void use() {
        System.out.println("Djembe is in use..");
    }

    
    void playDrum() {
        System.out.println("Playing Djembe drum..");
    }

    void slap() {
        System.out.println("Slapping the Djembe drum...");
    }


	
}






//here comes the 2 category of  instrument 



abstract class MedicalInstrument implements Instrument {
    abstract void operate();
}

class SurgicalInstrument extends MedicalInstrument {
    
    public void use() {
        System.out.println("Surgical Instrument is in use..");
    }

    
    void operate() {
        System.out.println("Performing a surgical operation with the instrument..");
    }
}

class SurgicalCutter extends SurgicalInstrument {

    void operate() {
        System.out.println("Using the Surgical Cutter for a surgical operation..");
    }
}

class SurgicalNeedle extends SurgicalInstrument {

    void operate() {
        System.out.println("Using the Surgical Needle for a surgical operation..");
    }
}




//here comes the 3 category of  instrument
abstract class ElectronicInstrument implements Instrument {
    abstract void playSound();
}
//A synthesizer is an electronic musical instrument that generates audio signals. Synthesizers typically create sounds by generating waveforms through methods including subtractive synthesis, additive synthesis and frequency modulation synthesis. These sounds may be altered by components such as filters, which cut or boost frequencies; envelopes, which control articulation, or how notes begin and end; and low-frequency oscillators, which modulate parameters such as pitch, volume, or filter characteristics affecting timbre. Synthesizers are typically played with keyboards or controlled by sequencers, software or other instruments and may be synchronized to other equipment via MIDI.
class Synthesizer extends ElectronicInstrument {
    
    public void use() {
        System.out.println("Synthesizer is in use..");
    }

    
    void playSound() {
        System.out.println("Playing sound on the Synthesizer..");
    }

    void changePatch() {
        System.out.println("Changing patch on the Synthesizer...");
    }
}

class ElectronicDrum extends ElectronicInstrument {
    
    public void use() {
        System.out.println("Electronic Drum is in use..");
    }

    
    void playSound() {
        System.out.println("Playing sound on the Electronic Drum..");
    }

    void adjustVolume() {
        System.out.println("Adjusting volume on the Electronic Drum...");
    }
}




//here comes the 4 category of  instrument
abstract class MeasuringInstrument implements Instrument {
    abstract void measure();
}

class ScientificMeasuringInstrument extends MeasuringInstrument {
    
    public void use() {
        System.out.println("Scientific Measuring Instrument is in use..");
    }

    
    void measure() {
        System.out.println("Taking precise measurements with the scientific measuring instrument..");
    }

    void calibrate() {
        System.out.println("Calibrating the scientific measuring instrument...");
    }
}

class Caliper extends ScientificMeasuringInstrument {
    
    void measure() {
        System.out.println("Measuring dimensions with the Caliper..");
    }

    void switchUnits() {
        System.out.println("Switching measurement units on the Caliper...");
    }
}




class DailyMeasuringInstrument extends MeasuringInstrument {
    
    public void use() {
        System.out.println("Daily Measuring Instrument is in use..");
    }

    
    void measure() {
        System.out.println("Taking daily measurements with the measuring instrument..");
    }

    void reset() {
        System.out.println("Resetting the daily measuring instrument...");
    }
}

class Pedometer extends DailyMeasuringInstrument {
    
    void measure() {
        System.out.println("Counting steps with the Pedometer..");
    }

    void setGoal(int stepsGoal) {
        System.out.println("Setting daily steps goal to: " + stepsGoal);
    }
}



//here comes the 5 category of  instrument

abstract class OpticalInstrument implements Instrument {
    abstract void observe();
}

class Telescope extends OpticalInstrument {
    
    public void use() {
        System.out.println("Telescope is in use..");
    }

    
    void observe() {
        System.out.println("Observing distant objects with the Telescope..");
    }

    void adjustFocus() {
        System.out.println("Adjusting the focus of the Telescope...");
    }
}

class Microscope extends OpticalInstrument {
    
    public void use() {
        System.out.println("Microscope is in use..");
    }

    
    void observe() {
        System.out.println("Observing tiny objects with the Microscope..");
    }

    void magnify() {
        System.out.println("Magnifying the image on the Microscope...");
    }
}

class Binoculars extends OpticalInstrument {
    
    public void use() {
        System.out.println("Binoculars are in use..");
    }

    
    void observe() {
        System.out.println("Observing objects with the Binoculars..");
    }

    void adjustZoom() {
        System.out.println("Adjusting the zoom level of the Binoculars...");
    }
}



