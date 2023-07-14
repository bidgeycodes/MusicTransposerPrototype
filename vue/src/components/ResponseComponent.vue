<template>
    <div>
    <PianoKeyHover v-for="(note, index) in notes" :key="index" :note="note" />
    </div>
  </template>
  
  <script>
  import PianoKeyHover from './PianoKeyHover.vue';
  
  export default {
    components: {
    PianoKeyHover,
},
    data() {
      return {
        notes: ['C', 'C#/Db', 'D', 'D#/Eb', 'E', 'F',
        'F#/Gb', 'G', 'G#/Ab', 'A', 'A#/Bb', 'B', 'C'],
      };
    },
  };
  </script>


<script>

</script>



<style scoped>

p {
    text-align: center;
}

</style>