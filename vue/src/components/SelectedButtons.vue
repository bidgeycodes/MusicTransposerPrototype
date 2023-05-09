<template>
  <div class="majorMinor">
    <input type="radio" id="major" value="Major" v-model="selected" />
    <label for="major">Major</label> 
    <input type="radio" id="minor" value="Minor" v-model="selected" />
    <label for="minor">Minor</label>
  </div>
  <div class="keyChord">
    <input type="radio" id="key" value="Key" v-model="selected" />
    <label for="key">Key</label> 
    <input type="radio" id="chord" value="Chord" v-model="selected" />
    <label for="chord">Chord</label>
  </div>
</template>

<script>
export default {
  data() {
    return {
      selected: "Major"
    };
  },
  methods: {}
};
</script>

<style scoped>

.majorMinor, .keyChord {
width: auto;
display: inline-block;
display: flex;
justify-content: center;
flex-direction: column;
align-items: center;
}

</style>