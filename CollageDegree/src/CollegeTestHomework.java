
public class CollegeTestHomework {

    public static void main(String[] args) {

        // Bachelor of Science (B.Sc.)
        Degree bachelorOfScience = new BSc();
        bachelorOfScience.use();
        ((BSc) bachelorOfScience).studyMathematics();
        ((BSc) bachelorOfScience).studyPhysics();
        ((BSc) bachelorOfScience).studyChemistry();

        System.out.println("--------------------");

        // Bachelor of Arts (B.A.)
        Degree bachelorOfArts = new BA();
        bachelorOfArts.use();
        ((BA) bachelorOfArts).studyEnglishLiterature();
        ((BA) bachelorOfArts).studyHistory();
        ((BA) bachelorOfArts).studyPsychology();

        System.out.println("--------------------");

        // Bachelor of Commerce (B.Com.)
        Degree bachelorOfCommerce = new BCom();
        bachelorOfCommerce.use();
        ((BCom) bachelorOfCommerce).studyAccounting();
        ((BCom) bachelorOfCommerce).studyEconomics();
        ((BCom) bachelorOfCommerce).studyBusinessManagement();

        System.out.println("--------------------");

        // Master of Science (M.Sc.)
        Degree masterOfScience = new MSc();
        masterOfScience.use();
        ((MSc) masterOfScience).studyMolecularBiology();
        ((MSc) masterOfScience).studyDataScience();
        ((MSc) masterOfScience).studyEnvironmentalScience();

        System.out.println("--------------------");

        // Master of Business Administration (MBA)
        Degree masterOfBusinessAdmin = new MBA();
        masterOfBusinessAdmin.use();
        ((MBA) masterOfBusinessAdmin).studyMarketingManagement();
        ((MBA) masterOfBusinessAdmin).studyFinanceAndAccounting();
        ((MBA) masterOfBusinessAdmin).studyHumanResourceManagement();

        System.out.println("--------------------");

        // Master of Engineering (M.Eng.)
        Degree masterOfEngineering = new MEng();
        masterOfEngineering.use();
        ((MEng) masterOfEngineering).studyStructuralEngineering();
        ((MEng) masterOfEngineering).studySoftwareEngineering();
        ((MEng) masterOfEngineering).studyElectricalPowerSystems();

        System.out.println("--------------------");

        // PhD in Natural Sciences
        Degree phdNaturalSciences = new PhdNaturalSciences();
        phdNaturalSciences.use();
        ((PhdNaturalSciences) phdNaturalSciences).studyAstrophysics();
        ((PhdNaturalSciences) phdNaturalSciences).studyOrganicChemistry();
        ((PhdNaturalSciences) phdNaturalSciences).studyNeuroscience();

        System.out.println("--------------------");

        // PhD in Social Sciences
        Degree phdSocialSciences = new PhdSocialSciences();
        phdSocialSciences.use();
        ((PhdSocialSciences) phdSocialSciences).studySociology();
        ((PhdSocialSciences) phdSocialSciences).studyAnthropology();
        ((PhdSocialSciences) phdSocialSciences).studyPoliticalScience();

        System.out.println("--------------------");

        // PhD in Engineering
        Degree phdEngineering = new PhdEngineering();
        phdEngineering.use();
        ((PhdEngineering) phdEngineering).studyMaterialsEngineering();
        ((PhdEngineering) phdEngineering).studyBiomedicalEngineering();
        ((PhdEngineering) phdEngineering).studyComputerVisionAndRobotics();
    }
}

//
//Collage
//|
//+-- Undergraduate (UG) Degrees
//|   |
//|   +-- Bachelor of Science (B.Sc.)
//|   |   |
//|   |   +-- Mathematics
//|   |   |
//|   |   +-- Physics
//|   |   |
//|   |   +-- Chemistry
//|   |
//|   +-- Bachelor of Arts (B.A.)
//|   |   |
//|   |   +-- English Literature
//|   |   |
//|   |   +-- History
//|   |   |
//|   |   +-- Psychology
//|   |
//|   +-- Bachelor of Commerce (B.Com.)
//|       |
//|       +-- Accounting
//|       |
//|       +-- Economics
//|       |
//|       +-- Business Management
//|
//+-- Postgraduate (PG) Degrees
//|   |
//|   +-- Master of Science (M.Sc.)
//|   |   |
//|   |   +-- Molecular Biology
//|   |   |
//|   |   +-- Data Science
//|   |   |
//|   |   +-- Environmental Science
//|   |
//|   +-- Master of Business Administration (MBA)
//|   |   |
//|   |   +-- Marketing Management
//|   |   |
//|   |   +-- Finance and Accounting
//|   |   |
//|   |   +-- Human Resource Management
//|   |
//|   +-- Master of Engineering (M.Eng.)
//|       |
//|       +-- Structural Engineering
//|       |
//|       +-- Software Engineering
//|       |
//|       +-- Electrical Power Systems
//|
//+-- PhD (Doctor of Philosophy) Programs
// |
// +-- PhD in Natural Sciences
// |   |
// |   +-- Astrophysics
// |   |
// |   +-- Organic Chemistry
// |   |
// |   +-- Neuroscience
// |
// +-- PhD in Social Sciences
// |   |
// |   +-- Sociology
// |   |
// |   +-- Anthropology
// |   |
// |   +-- Political Science
// |
// +-- PhD in Engineering
//     |
//     +-- Materials Engineering
//     |
//     +-- Biomedical Engineering
//     |
//     +-- Computer Vision and Robotics
//
//
//


// College
interface Degree {
    void use();
}

// Undergraduate (UG) Degrees
abstract class UndergraduateDegree implements Degree {
    abstract void study();
}

class BSc extends UndergraduateDegree {
    public void use() {
        System.out.println("Bachelor of Science (B.Sc.) degree is in use..");
    }

    void study() {
        System.out.println("Studying B.Sc. courses...");
    }

    void studyMathematics() {
        System.out.println("Studying Mathematics...");
    }

    void studyPhysics() {
        System.out.println("Studying Physics...");
    }

    void studyChemistry() {
        System.out.println("Studying Chemistry...");
    }
}

class BA extends UndergraduateDegree {
    public void use() {
        System.out.println("Bachelor of Arts (B.A.) degree is in use..");
    }

    void study() {
        System.out.println("Studying B.A. courses...");
    }

    void studyEnglishLiterature() {
        System.out.println("Studying English Literature...");
    }

    void studyHistory() {
        System.out.println("Studying History...");
    }

    void studyPsychology() {
        System.out.println("Studying Psychology...");
    }
}

class BCom extends UndergraduateDegree {
    public void use() {
        System.out.println("Bachelor of Commerce (B.Com.) degree is in use..");
    }

    void study() {
        System.out.println("Studying B.Com. courses...");
    }

    void studyAccounting() {
        System.out.println("Studying Accounting...");
    }

    void studyEconomics() {
        System.out.println("Studying Economics...");
    }

    void studyBusinessManagement() {
        System.out.println("Studying Business Management...");
    }
}

// Postgraduate (PG) Degrees
abstract class PostgraduateDegree implements Degree {
    abstract void study();
}

class MSc extends PostgraduateDegree {
    public void use() {
        System.out.println("Master of Science (M.Sc.) degree is in use..");
    }

    void study() {
        System.out.println("Studying M.Sc. courses...");
    }

    void studyMolecularBiology() {
        System.out.println("Studying Molecular Biology...");
    }

    void studyDataScience() {
        System.out.println("Studying Data Science...");
    }

    void studyEnvironmentalScience() {
        System.out.println("Studying Environmental Science...");
    }
}

class MBA extends PostgraduateDegree {
    public void use() {
        System.out.println("Master of Business Administration (MBA) degree is in use..");
    }

    void study() {
        System.out.println("Studying MBA courses...");
    }

    void studyMarketingManagement() {
        System.out.println("Studying Marketing Management...");
    }

    void studyFinanceAndAccounting() {
        System.out.println("Studying Finance and Accounting...");
    }

    void studyHumanResourceManagement() {
        System.out.println("Studying Human Resource Management...");
    }
}

class MEng extends PostgraduateDegree {
    public void use() {
        System.out.println("Master of Engineering (M.Eng.) degree is in use..");
    }

    void study() {
        System.out.println("Studying M.Eng. courses...");
    }

    void studyStructuralEngineering() {
        System.out.println("Studying Structural Engineering...");
    }

    void studySoftwareEngineering() {
        System.out.println("Studying Software Engineering...");
    }

    void studyElectricalPowerSystems() {
        System.out.println("Studying Electrical Power Systems...");
    }
}

// PhD (Doctor of Philosophy) Programs
abstract class PhdProgram implements Degree {
    abstract void study();
}

class PhdNaturalSciences extends PhdProgram {
    public void use() {
        System.out.println("PhD in Natural Sciences degree is in use..");
    }

    void study() {
        System.out.println("Studying PhD in Natural Sciences courses...");
    }

    void studyAstrophysics() {
        System.out.println("Studying Astrophysics...");
    }

    void studyOrganicChemistry() {
        System.out.println("Studying Organic Chemistry...");
    }

    void studyNeuroscience() {
        System.out.println("Studying Neuroscience...");
    }
}

class PhdSocialSciences extends PhdProgram {
    public void use() {
        System.out.println("PhD in Social Sciences degree is in use..");
    }

    void study() {
        System.out.println("Studying PhD in Social Sciences courses...");
    }

    void studySociology() {
        System.out.println("Studying Sociology...");
    }

    void studyAnthropology() {
        System.out.println("Studying Anthropology...");
    }

    void studyPoliticalScience() {
        System.out.println("Studying Political Science...");
    }
}

class PhdEngineering extends PhdProgram {
    public void use() {
        System.out.println("PhD in Engineering degree is in use..");
    }

    void study() {
        System.out.println("Studying PhD in Engineering courses...");
    }

    void studyMaterialsEngineering() {
        System.out.println("Studying Materials Engineering...");
    }

    void studyBiomedicalEngineering() {
        System.out.println("Studying Biomedical Engineering...");
    }

    void studyComputerVisionAndRobotics() {
        System.out.println("Studying Computer Vision and Robotics...");
    }
}
