<template>
    <input type="radio" id="major" value="Major" v-model="selected" />
    <label for="major">Major</label> 
    <input type="radio" id="minor" value="Minor" v-model="selected" />
    <label for="minor">Minor</label>
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