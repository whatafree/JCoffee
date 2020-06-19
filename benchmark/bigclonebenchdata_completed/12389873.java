
import java.io.UncheckedIOException;


class c12389873 {

    private void load() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            MyHelperClass FidoDataSource = new MyHelperClass();
            conn =(Connection)(Object) FidoDataSource.getConnection();
            conn.setAutoCommit(false);
            stmt =(Statement)(Object) conn.createStatement();
            MyHelperClass ClearData = new MyHelperClass();
            ClearData.clearTables(stmt);
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (100, 'Living Thing')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (200, 'Inanimate Object')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (300, 'Dog')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (400, 'Sheltie')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (500, 'Eskimo')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (600, 'Person')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (700, 'Collar')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (800, 'Ball')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (401, 'Fido')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (501, 'Samantha')");
            stmt.executeUpdate("insert into Objects (ObjectId, Description) values (801, 'A collar')");
            stmt.executeQuery("select setval('objects_objectid_seq', 1000)");
            stmt.executeUpdate("insert into ClassLinkTypes (LinkName, LinkType) values ('hasa', 2)");
            stmt.executeUpdate("insert into ClassLinkTypes (LinkName, LinkType) values ('partof', 2)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (100, 'isa', 1)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (200, 'isa', 1)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (300, 'isa', 100)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (400, 'isa', 300)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (500, 'isa', 300)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (600, 'isa', 100)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (700, 'isa', 200)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (800, 'isa', 200)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (401, 'instance', 400)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (501, 'instance', 500)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (801, 'instance', 800)");
            stmt.executeUpdate("insert into ObjectLinks (ObjectId, LinkName, LinkToObject) values (401, 'hasa', 801)");
            stmt.executeUpdate("insert into AttributeCategories (CategoryName) values ('color')");
            stmt.executeUpdate("insert into AttributeCategories (CategoryName) values ('weight')");
            stmt.executeUpdate("insert into AttributeCategories (CategoryName) values ('length')");
            stmt.executeUpdate("insert into Attributes (AttributeName, Category) values ('green', 'color')");
            stmt.executeUpdate("insert into Attributes (AttributeName, Category) values ('blue', 'color')");
            stmt.executeUpdate("insert into Attributes (AttributeName, Category) values ('light', 'weight')");
            stmt.executeUpdate("insert into Attributes (AttributeName, Category) values ('heavy', 'weight')");
            stmt.executeUpdate("insert into Attributes (AttributeName, Category) values ('short', 'length')");
            stmt.executeUpdate("insert into Attributes (AttributeName, Category) values ('long', 'length')");
            stmt.executeUpdate("insert into ObjectAttributes (ObjectId, AttributeName) values (401, 'light')");
            stmt.executeUpdate("insert into ObjectAttributes (ObjectId, AttributeName) values (401, 'short')");
            stmt.executeUpdate("insert into ObjectAttributes (ObjectId, AttributeName) values (801, 'blue')");
            stmt.executeUpdate("insert into Dictionary (Word, SenseNumber, GrammarString, ObjectId) values ('LEFT-WALL', '1', 'AV+ | NP+', 1)");
            stmt.executeUpdate("insert into Dictionary (Word, SenseNumber, GrammarString, ObjectId) values ('the', '1', 'D+', 1)");
            stmt.executeUpdate("insert into Dictionary (Word, SenseNumber, GrammarString, ObjectId) values ('big', '1', 'ADJ+', 400)");
            stmt.executeUpdate("insert into Dictionary (Word, SenseNumber, GrammarString, ObjectId) values ('dog', '1', '[@ADJ-] & [D-] & (S+ | DO- | PO- | NP-)', 700)");
            stmt.executeUpdate("insert into Dictionary (Word, SenseNumber, GrammarString, ObjectId) values ('run', '1', '[S-] & AV- & [PREP+]', 800)");
            stmt.executeUpdate("insert into Dictionary (Word, SenseNumber, GrammarString, ObjectId) values ('across', '1', 'PREP- & PO+', 800)");
            stmt.executeUpdate("insert into Dictionary (Word, SenseNumber, GrammarString, ObjectId) values ('street', '1', '[@ADJ-] & [D-] & (S+ | DO- | PO- | NP-)', 800)");
            stmt.executeUpdate("insert into AdjectivePrepositions (PrepositionName, ObjectId, LinkName) values ('with', 100, 'hasa')");
            stmt.executeUpdate("insert into AdjectivePrepositions (PrepositionName, ObjectId, LinkName) values ('in', 200, 'partof')");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'superlative', 1, 'good', 'best', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'superlative', 2, '*y', '*iest', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'superlative', 3, '*e', '*est', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'superlative', 4, '*', '*est', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'comparative', 1, 'good', 'better', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'comparative', 2, '*y', '*ier', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'comparative', 3, '*e', '*er', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'comparative', 4, '*', '*er', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'possessive', 1, '*s', '*s\\'', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'possessive', 2, '*', '*\\'s', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'present perfect', 1, 'be', 'being', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'present perfect', 2, '*Vy', '*Vying', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'present perfect', 3, '*c', '*cking', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'present perfect', 4, '*VVC', '*VVCing', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'present perfect', 5, '*VC', '*VCCing', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'present perfect', 6, '*ie', '*ying', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'present perfect', 7, '*e', '*ing', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'present perfect', 8, '*', '*ing', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 1, 'sing', 'sang', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 2, 'give', 'gave', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 3, 'swim', 'swam', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 4, 'have', 'had', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 5, 'run', 'ran', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 6, 'do', 'did', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 7, 'be', 'was', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 8, 'throw', 'threw', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 9, 'sleep', 'slept', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 10, '*c', '*cked', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 11, '*VVC', '*VVCed', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 12, '*VC', '*VCCed', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 13, '*y', '*ied', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 14, '*oe', '*oed', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 15, '*e', '*ed', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past', 16, '*', '*ed', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 1, 'sing', 'sung', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 2, 'give', 'given', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 3, 'swim', 'swum', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 4, 'have', 'had', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 5, 'do', 'done', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 6, 'be', 'been', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 7, 'sleep', 'slept', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 8, '*e', '*ed', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'past perfect', 9, '*', '*ed', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'first singular', 1, 'be', 'am', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'first singular', 2, 'have', 'have', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'first singular', 3, '*', '*', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'second singular', 1, 'be', 'are', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'second singular', 2, 'have', 'have', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'second singular', 3, '*', '*', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 1, 'be', 'is', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 2, 'have', 'has', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 3, 'do', 'do', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 4, '*ch', '*ches', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 5, '*sh', '*shes', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 6, '*x', '*xes', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 7, '*z', '*zes', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 8, '*Cy', '*Cies', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 9, '*s', '*ses', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 10, '*o', '*oes', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third singular', 11, '*', '*s', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'first plural', 1, 'be', 'are', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'first plural', 2, 'have', 'have', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'first plural', 3, '*', '*', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third plural', 1, 'be', 'are', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third plural', 2, 'have', 'have', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'third plural', 3, '*', '*', FALSE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 1, 'leaf', 'leaves', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 2, 'knife', 'knives', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 3, 'elf', 'elves', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 4, 'half', 'halves', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 5, 'loaf', 'loaves', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 6, 'shelf', 'shelves', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 7, 'wife', 'wives', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 8, 'person', 'people', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 9, 'deer', 'deer', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 10, 'child', 'children', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 11, '*Co', '*Coes', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 12, '*s', '*ses', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 13, '*ch', '*ches', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 14, '*sh', '*shes', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 15, '*x', '*xes', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 16, '*z', '*zes', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 17, '*Cy', '*Cies', TRUE)");
            stmt.executeUpdate("insert into LanguageMorphologies (LanguageName, MorphologyTag, Rank, Root, Surface, Used) values ('English', 'plural', 18, '*', '*s', TRUE)");
            stmt.executeUpdate("insert into WordClassifications (Rank, Pattern, GrammarString, ObjectId, Description) values (1, '$N[.N]', 'D+', 100, 'money')");
            stmt.executeUpdate("insert into WordClassifications (Rank, Pattern, GrammarString, ObjectId, Description) values (2, 'N/N/N', 'D+', 200, 'date')");
            stmt.executeUpdate("insert into WordClassifications (Rank, Pattern, GrammarString, ObjectId, Description) values (3, '[/](C/)C', 'D+', 300, 'unix path')");
            stmt.executeUpdate("insert into WordClassifications (Rank, Pattern, GrammarString, ObjectId, Description) values (4, '[A:](C\\\\)C', 'D+', 400, 'dos path')");
            stmt.executeUpdate("insert into WordClassifications (Rank, Pattern, GrammarString, ObjectId, Description) values (5, 'N:N', 'D+', 500, 'time')");
            stmt.executeUpdate("insert into WordClassifications (Rank, Pattern, GrammarString, ObjectId, Description) values (6, 'N.N.N.N', 'D+', 600, 'internet')");
            stmt.executeUpdate("insert into WordClassifications (Rank, Pattern, GrammarString, ObjectId, Description) values (7, 'E(.E)', 'D+', 700, 'hostname')");
            stmt.executeUpdate("insert into WordClassifications (Rank, Pattern, GrammarString, ObjectId, Description) values (8, '{+-}N[.N]', 'D+', 800, 'number')");
            stmt.executeUpdate("insert into Pronouns (Pronoun, Person, Gender, Plural) values ('i', 1, 3, FALSE)");
            stmt.executeUpdate("insert into Pronouns (Pronoun, Person, Gender, Plural) values ('we', 1, 3, TRUE)");
            stmt.executeUpdate("insert into Pronouns (Pronoun, Person, Gender, Plural) values ('they', 3, 3, TRUE)");
            stmt.executeUpdate("insert into Pronouns (Pronoun, Person, Gender, Plural) values ('he', 3, 1, FALSE)");
            stmt.executeUpdate("insert into Pronouns (Pronoun, Person, Gender, Plural) values ('she', 3, 2, FALSE)");
            stmt.executeUpdate("insert into Pronouns (Pronoun, Person, Gender, Plural) values ('it', 3, 3, FALSE)");
            stmt.executeUpdate("insert into Pronouns (Pronoun, Person, Gender, Plural) values ('you', 2, 3, FALSE)");
            stmt.executeUpdate("insert into FrameSlots (SlotName) values ('actor')");
            stmt.executeUpdate("insert into FrameSlots (SlotName) values ('origin')");
            stmt.executeUpdate("insert into FrameSlots (SlotName) values ('destination')");
            stmt.executeUpdate("insert into FrameSlots (SlotName) values ('object')");
            stmt.executeUpdate("insert into FrameSlots (SlotName) values ('instrument')");
            stmt.executeUpdate("insert into FrameSlots (SlotName) values ('beneficiary')");
            stmt.executeUpdate("insert into FrameSlots (SlotName) values ('location')");
            stmt.executeUpdate("insert into Verbs (VerbName, SubjectSlot, IndirectObjectSlot, PredicateNounSlot) values ('throw', 'actor', 'destination', 'object')");
            stmt.executeUpdate("insert into Verbs (VerbName, SubjectSlot, IndirectObjectSlot, PredicateNounSlot) values ('melt', 'actor', '', '')");
            stmt.executeUpdate("insert into Verbs (VerbName, SubjectSlot, IndirectObjectSlot, PredicateNounSlot) values ('kill', 'actor', '', 'object')");
            stmt.executeUpdate("insert into AdverbPrepositions (PrepositionName, ObjectId, FrameSlot) values ('with', 200, 'instrument')");
            stmt.executeUpdate("insert into AdverbPrepositions (PrepositionName, ObjectId, FrameSlot) values ('at', 1, 'location')");
            stmt.executeUpdate("insert into Articles (ArticleName, Dereference) values ('the', 1)");
            stmt.executeUpdate("insert into Articles (ArticleName, Dereference) values ('a', 2)");
            stmt.executeUpdate("insert into Articles (ArticleName, Dereference) values ('an', 2)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('S', 1)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('PN', 2)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('DO', 3)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('IO', 4)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('PO', 5)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('NP', 6)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('AV', 7)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('LV', 8)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('PREP', 9)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('D', 10)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('ADJ', 11)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('ADV', 12)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('CONJ', 13)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('INTJ', 14)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('PA', 15)");
            stmt.executeUpdate("insert into GrammarLinks (LinkName, LinkType) values ('HV', 16)");
            stmt.executeQuery("select setval('instructions_instructionid_seq', 1)");
            int next = 2;
            stmt.executeUpdate("insert into Instructions (Type, ExecuteString, FrameSlot, Operator, LinkName, ObjectId, AttributeName) " + "values (3, 'throw', null, 0, null, null, null)");
            stmt.executeUpdate("insert into Instructions (Type, ExecuteString, FrameSlot, Operator, LinkName, ObjectId, AttributeName) " + "values (3, 'test', null, 0, null, null, null)");
            stmt.executeUpdate("insert into Instructions (Type, ExecuteString, FrameSlot, Operator, LinkName, ObjectId, AttributeName) " + "values (2, null, 'actor', 1, 'hasa', '300', '')");
            stmt.executeUpdate("insert into Instructions (Type, ExecuteString, FrameSlot, Operator, LinkName, ObjectId, AttributeName) " + "values (2, null, 'instrument', 3, null, null, 'blue')");
            stmt.executeUpdate("insert into Instructions (Type, ExecuteString, FrameSlot, Operator, LinkName, ObjectId, AttributeName) " + "values (1, null, null, 0, null, null, null)");
            stmt.executeUpdate("insert into Instructions (Type, ExecuteString, FrameSlot, Operator, LinkName, ObjectId, AttributeName) " + "values (3, 'get', null, 0, null, null, null)");
            stmt.executeUpdate("insert into Instructions (Type, ExecuteString, FrameSlot, Operator, LinkName, ObjectId, AttributeName) " + "values (3, 'drop', null, 0, null, null, null)");
            stmt.executeUpdate("insert into InstructionGroups (InstructionId, Rank, GroupInstruction) values (" + (next + 2) + ", 1, " + (next + 0) + ")");
            stmt.executeUpdate("insert into InstructionGroups (InstructionId, Rank, GroupInstruction) values (" + (next + 2) + ", 2, " + (next + 1) + ")");
            stmt.executeUpdate("insert into InstructionGroups (InstructionId, Rank, GroupInstruction) values (" + (next + 3) + ", 1, " + (next + 1) + ")");
            stmt.executeUpdate("insert into InstructionGroups (InstructionId, Rank, GroupInstruction) values (" + (next + 3) + ", 2, " + (next + 0) + ")");
            stmt.executeUpdate("insert into InstructionGroups (InstructionId, Rank, GroupInstruction) values (" + (next + 4) + ", 1, " + (next + 2) + ")");
            stmt.executeUpdate("insert into InstructionGroups (InstructionId, Rank, GroupInstruction) values (" + (next + 4) + ", 2, " + (next + 3) + ")");
            stmt.executeQuery("select setval('transactions_transactionid_seq', 1)");
            stmt.executeUpdate("insert into Transactions (InstructionId, Description) values (" + (next + 4) + ", 'throw something')");
            stmt.executeUpdate("insert into Transactions (InstructionId, Description) values (" + (next + 5) + ", 'get something')");
            stmt.executeUpdate("insert into Transactions (InstructionId, Description) values (" + (next + 6) + ", 'drop something')");
            stmt.executeUpdate("insert into TransactionPreconditions (TransactionId, IfFrameSlot, Operator, LinkName, LinkFrameSlot, AttributeName, SatisfyTransactionId) " + "values (2, 'actor', 1, 'hasa', 'object', '', 3)");
            stmt.executeUpdate("insert into TransactionPreconditions (TransactionId, IfFrameSlot, Operator, LinkName, LinkFrameSlot, AttributeName, SatisfyTransactionId) " + "values (2, 'object', 4, '', '', 'heavy', 4)");
            stmt.executeUpdate("insert into TransactionSlots (TransactionId, FrameSlot, InstructionId) values (2, 'object', " + (next + 6) + ")");
            stmt.executeUpdate("insert into TransactionSlots (TransactionId, FrameSlot, InstructionId) values (2, 'destination', " + (next + 5) + ")");
            stmt.executeQuery("select setval('verbtransactions_verbid_seq', 1)");
            stmt.executeUpdate("insert into VerbTransactions (VerbString, MoodType, TransactionId) values ('throw', 2, 2)");
            stmt.executeUpdate("insert into VerbConstraints (VerbId, FrameSlot, ObjectId) values (2, 'object', 200)");
            stmt.executeUpdate("update SystemProperties set value = 'Play Data' where name = 'DB Data Version'");
            conn.commit();
        } catch (UncheckedIOException e) {
            if (conn != null) conn.rollback();
            throw e;
        } finally {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass clearTables(Statement o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}
