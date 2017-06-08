# Java Version

This was built using Haxe from [this haxe code](https://github.com/Tw1ddle/MarkovNameGenerator/tree/master/lib)
from [this repo](https://github.com/Tw1ddle/MarkovNameGenerator).  Everything is
Sam's, including the text below.

## Rebuild

You could, in theory, generate this again like so:

- Create a hxml file in the checked-out lib directory (MarkovNameGenerator_LOCATION/lib):

```
-lib sure

-cp markov

markov.namegen.Generator
markov.namegen.Model
markov.namegen.NameGenerator
markov.util.ArraySet
markov.util.EditDistanceMetrics
markov.util.FileReader
markov.util.IntExtensions
markov.util.PrefixTrie
markov.util.StringExtensions

-java SOME_TEMP_FOLDER
-D no-compilation
```

```bash
cd MarkovNameGenerator_LOCATION/lib
haxelib install sure
haxelib install hxjava
haxe buidl.hxml
mv SOME_TEMP_FOLDER/* THIS_PROJECT_LOCATION/src/main/java
```

This is quite likely to

# Markov Namegen

Markov Namegen is a Markov chain-based word generator written in Haxe, made for procedural name generation. Try the demo out [here](http://www.samcodes.co.uk/project/markov-namegen/).

## Features
* Katz backoff using "high order" models - look up to "n" characters back.
* Sort and filter generated strings by length, start, end and content.
* Damerau-Levenshtein distance sort method.
* Dirichlet prior parameter.

## Usage

See the [demo code](https://github.com/Tw1ddle/MarkovNameGenerator) for a complete worked example. Also read the [documentation here](http://tw1ddle.github.io/MarkovNameGenerator/).

## Tips
* The generator works by using Markov chains, and requires training data to build them. A hundred or more words within your chosen category is usually sufficient for good results.
* Sort words by similarity to preferred "good words" using an edit distance metric, and pick the most similar and suitable results. There are a few edit distance measures provided in EditDistanceMetrics.hx.
* To get best results the training dataset, model order and prior will need to be tweaked for the type of words you want to generate. If possible, keep the prior parameter low or zero. Filter words to suit: look at length, beginning, end, contents, edit distance limits. Some of this done for you in NameGenerator.hx. If you prefer to do it your own way, subclass the Generator class.

## Notes
* Many of the concepts used for the generator were suggested in [this article](http://www.roguebasin.com/index.php?title=Names_from_a_high_order_Markov_Process_and_a_simplified_Katz_back-off_scheme) by [Jeffrey Lund](https://github.com/jlund3).
* The haxelib supports every Haxe target.
* If you have any questions or suggestions then [get in touch](http://samcodes.co.uk/contact) or open an issue.%
